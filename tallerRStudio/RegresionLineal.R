#regresion lineal
#variable independiente
x = c(5,7,8,7,2,17,2,9,4,11,12,9,6)
#variable dependiente
y = c(99,86,87,88,111,86,103,87,94,78,77,85,86)

cor(x, y)

#formula regresion lineal simple
# y_ = b0 + b1*x

modelo = lm(y ~ x)
summary(modelo)

modelo["residuals"]
modelo["coefficients"]

plot(x, y)

abline(modelo, col = "red", lwd = 2)

nuevo_dato <- data.frame(x = 35)
prediccion_ingreso <- predict(modelo, nuevo_dato)
print(prediccion_ingreso)


nuevo_dato <- data.frame(x = c(10, 20, 30))
prediccion_ingreso <- predict(modelo, nuevo_dato)
print(prediccion_ingreso)


#importar dataset
datos
x1 = datos$X1
x4 = datos$X4

cor(x1, x4)
modelo = lm(x4 ~ x1)
summary(modelo)

modelo["residuals"]
modelo["coefficients"]

plot(x1, x4)



abline(modelo, col = "red", lwd = 2)

nuevo_dato <- data.frame(x1 = 33)
prediccion_ingreso <- predict(modelo, nuevo_dato)
print(prediccion_ingreso)
