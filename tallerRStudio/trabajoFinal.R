library(readr)
Datos <- read_csv("D:/data/varios/unl2/uide/cursos/curso regresion/trabajofinal/datos_modelos_lineales.csv")
attach(Datos)

print(Datos)

datosboxplot = Datos[, -c(2, 5, 9, 10)]
boxplot(Datos[, c(1, 7, 8)], 
        main = "Boxplot de Columnas de DataFrame",
        xlab = "Columnas", ylab = "Valor",
        col = c("lightblue", "lightgreen", "lightpink"), # Colores para cada columna
        border = "blue",
        notch = TRUE # opcional, añade un notch para comparar medianas
)

boxplot(Datos[, c(3, 6)], 
        main = "Boxplot de Columnas de DataFrame",
        xlab = "Columnas", ylab = "X3, X6",
        col = c("lightblue", "lightgreen", "lightpink"), # Colores para cada columna
        border = "blue",
        notch = TRUE # opcional, añade un notch para comparar medianas
)

boxplot(Datos[, c(4)], 
        main = "Boxplot de Columnas de DataFrame",
        xlab = "X4", ylab = "Valores",
        col = c("lightblue", "lightgreen", "lightpink"), # Colores para cada columna
        border = "blue",
        notch = TRUE # opcional, añade un notch para comparar medianas
)



# Crear el gráfico de barras
barplot(table(Datos[, 2]), 
        main = "Distribución de Variable Binaria",
        xlab = "X2",
        ylab = "Frecuencia",
        col = "lightblue",
        border = "blue"
)

barplot(table(Datos[, 5]), 
        main = "Distribución de Variable Binaria",
        xlab = "X5",
        ylab = "Frecuencia",
        col = "lightblue",
        border = "blue"
)

barplot(table(Datos[, 9]), 
        main = "Distribución de Variable Binaria",
        xlab = "X9",
        ylab = "Frecuencia",
        col = "lightblue",
        border = "blue"
)

barplot(table(Datos[, 10]), 
        main = "Distribución de Variable Binaria",
        xlab = "X10",
        ylab = "Frecuencia",
        col = "lightblue",
        border = "blue"
)


#grafico de correlacion
install.packages("GGally")
library(GGally)


# Crear la matriz de correlación
ggpairs(Datos)

summary(Datos)
head(Datos)

###############################################################
#modelo lineal simple
modelo <- lm(X4 ~ X1, data = Datos)
summary(modelo)

# Gráfico de dispersión
plot(Datos$X1, Datos$X4, main = "Ingreso Mensual vs. Edad",
     xlab = "Edad", ylab = "Ingreso Mensual", pch = 19, col = "blue")

# Añadir la línea de regresión
abline(modelo, col = "red", lwd = 2)

nuevos_datos <- data.frame(X1 = 35)
prediccion_ingreso <- predict(modelo, nuevos_datos)
print(prediccion_ingreso)

########################################################
# Modelo de Regresión Múltiple con Selección de Variables:
modelo_regresion_multiple <- lm(X4 ~ X1 + X2 + X3 + X5 + X6 + X7 + X8 + X9 + X10, data = Datos)
summary(modelo_regresion_multiple)

library(mixlm)
backward(modelo_regresion_multiple, alpha=0.15) # se puede usar: backward, forward,stepWise, wideForward 

nuevo_modelo = lm(formula = X4 ~ X1 + X10, data = Datos)
summary(nuevo_modelo)

nuevos_datos <- data.frame(X1 = 35, X10 = 1)
prediccion_ingreso <- predict(nuevo_modelo, nuevos_datos)
print(prediccion_ingreso)


########################################################
#Modelo de Regresión con Interacción:
modelo_interaccion <- lm(X4 ~ X1 + X3 + X1:X3, data = Datos)
summary(modelo_interaccion)

nuevos_datos <- data.frame(X1 = 27, X3 = 3)
prediccion_ingreso <- predict(modelo_interaccion, nuevos_datos)
print(prediccion_ingreso)

################################################################
#regresion polinomica
# Ajustar el modelo de regresión polinómica de segundo grado
modelo_polinomico <- lm(X4 ~ poly(X1, degree = 2), data = Datos)

# Mostrar los coeficientes del modelo
summary(modelo_polinomico)

nuevos_datos <- data.frame(X1 = 33)
prediccion_ingreso <- predict(modelo_polinomico, nuevos_datos)
print(prediccion_ingreso)

#################################################################
#Modelo de Regresión Lasso y Ridge
library(glmnet)

X <- as.matrix(Datos[, c("X1", "X2", "X3", "X5", "X6", "X7", "X8", "X9", "X10")])
Y <- Datos$X4

# Ajustar un modelo de regresión Ridge
modelo_ridge <- glmnet(X, Y, alpha = 0)
summary(modelo_ridge)

# Evolución de los coeficientes en función de lambda
# ==============================================================================
regularizacion <- modelo_ridge$beta %>% 
  as.matrix() %>%
  t() %>% 
  as_tibble() %>%
  mutate(lambda = modelo_ridge$lambda)

regularizacion <- regularizacion %>%
  pivot_longer(
    cols = !lambda, 
    names_to = "predictor",
    values_to = "coeficientes"
  )

regularizacion %>%
  ggplot(aes(x = lambda, y = coeficientes, color = predictor)) +
  geom_line() +
  scale_x_log10(
    breaks = trans_breaks("log10", function(x) 10^x),
    labels = trans_format("log10", math_format(10^.x))
  ) +
  labs(title = "Coeficientes del modelo en función de la regularización") +
  theme_bw() +
  theme(legend.position = "none")
# Evolución del error en función de lambda
# ==============================================================================
set.seed(123)
cv_error <- cv.glmnet(
  x      = X,
  y      = Y,
  alpha  = 0,
  nfolds = 10,
  type.measure = "mse",
  standardize  = TRUE
)

plot(cv_error)

# Mejor valor lambda encontrado
# ==============================================================================
paste("Mejor valor de lambda encontrado:", cv_error$lambda.min)

###################################################
#modelo lasso
# Ajustar un modelo de regresión Lasso
modelo_lasso <- glmnet(X, Y, alpha = 1)
summary(modelo_lasso)

# Evolución de los coeficientes en función de lambda
# ==============================================================================
regularizacion <- modelo_lasso$beta %>% 
  as.matrix() %>%
  t() %>% 
  as_tibble() %>%
  mutate(lambda = modelo_lasso$lambda)

regularizacion <- regularizacion %>%
  pivot_longer(
    cols = !lambda, 
    names_to = "predictor",
    values_to = "coeficientes"
  )

regularizacion %>%
  ggplot(aes(x = lambda, y = coeficientes, color = predictor)) +
  geom_line() +
  scale_x_log10(
    breaks = trans_breaks("log10", function(x) 10^x),
    labels = trans_format("log10", math_format(10^.x))
  ) +
  labs(title = "Coeficientes del modelo en función de la regularización") +
  theme_bw() +
  theme(legend.position = "none")
# Evolución del error en función de lambda
# ==============================================================================
set.seed(123)
cv_error <- cv.glmnet(
  x      = X,
  y      = Y,
  alpha  = 1,
  nfolds = 10,
  type.measure = "mae",
  standardize  = TRUE
)

plot(cv_error)

# Mejor valor lambda encontrado
# ==============================================================================
paste("Mejor valor de lambda encontrado:", cv_error$lambda.min)


# Ajustar un modelo de regresión lineal múltiple
modelo_lm <- lm(Y ~ ., data = Datos)

# Coeficientes del modelo de regresión lineal múltiple
coeficientes_lm <- coef(modelo_lm)
print(coeficientes_lm)



#########################################################
# Modelo de Regresión Logística Binaria:
modelo_reg_log_bin <- glm(X10 ~ X1+X2+X3+X4+X5+X6+X7+X8+X9, data = Datos, family = "binomial")

# Interpretar los coeficientes del modelo
summary(modelo_reg_log_bin)

nuevos_datos <- data.frame(X1 = 53, X2 = 0, X3 = 1, X4 = 3333, X5 = 1, 
                           X6 = 2, X7 = 45, X8 = 25.4, X9 = 1)
prediccion_fuma <- predict(modelo_reg_log_bin, nuevos_datos)
print(prediccion_fuma)
print(round(prediccion_fuma, 0))



#########################################################
# Modelo de Regresión Logística multinomial:
library(nnet)

modelo_reg_log_multi <- multinom(X3 ~ X1+X2+X4+X5+X6+X7+X8+X9+X10, data = Datos)
# Muestra un resumen del modelo
summary(modelo_reg_log_multi)
glance(modelo_reg_log_multi)

nuevos_datos <- data.frame(X1 = 53, X2 = 0, X4 = 3333, X5 = 1, 
                           X6 = 2, X7 = 45, X8 = 25.4, X9 = 1, X10=1)
prediccion_edu <- predict(modelo_reg_log_multi, nuevos_datos)
print(prediccion_edu)




#########################
#### Supuestos del modelo ####
modelo_escogido = lm(formula = X4 ~ X1 + X10, data = Datos)
summary(modelo_escogido)

residuos<- modelo_escogido$residuals

plot(residuos);abline(h=0)


library(lmtest)
reset(modelo_escogido)

# Normalidad 
shapiro.test(residuos)
# se puede decir que los residuos siguen una distribución normal

# homocedasticidad
#install.packages("car")
library(car)
leveneTest(residuos, Datos$X4)
# No se tiene homocedasticidad en los residuos

hmctest(modelo_escogido)

#contrastes de independencia
dwtest(modelo_escogido)

Box.test(modelo_escogido$residuals,type="Ljung-Box") #para autocorrelacion de orden 1

Box.test(modelo_escogido$residuals,lag=2,type="Ljung-Box") #autocorrelacion de orden 2

