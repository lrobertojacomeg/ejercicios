# Crear un arreglo de 20 números aleatorios
numeros = rnorm(20)

# Mostrar el arreglo
print(numeros)

# Calcular estadísticas básicas
media = mean(numeros)
mediana = median(numeros)
desviacion = sd(numeros)
minimo = min(numeros)
maximo = max(numeros)

# Mostrar estadísticas
cat("Media:", media, "\n")
cat("Mediana:", mediana, "\n")
cat("Desviación estándar:", desviacion, "\n")
cat("Mínimo:", minimo, "\n")
cat("Máximo:", maximo, "\n")

# Crear un data frame con los datos
df <- data.frame(numeros)

# Diagrama de pastel
pie_chart <- pie(table(round(df$numeros)), main = "Diagrama de Pastel")

# Histograma
histograma <- hist(df$numeros, col = "blue", main = "Histograma")

# Diagrama de dispersión
dispersion <- plot(df$numeros, main = "Diagrama de Dispersión", 
                   xlab = "Índice", ylab = "Valores")

# Gráfico de barras
barras <- barplot(table(round(df$numeros)), main = "Gráfico de Barras", xlab = "Valores", ylab = "Frecuencia")

# Diagrama de cajas
boxplot(df$numeros, main = "Diagrama de Cajas", ylab = "Valores")

# Histograma
hist(df$numeros, col = "lightblue", main = "Histograma y Curva Normal", 
     xlab = "Valores", ylab = "Frecuencia")

# Curva normal
curve(dnorm(x, mean = mean(df$numeros), sd = sd(df$numeros)), 
      col = "darkred", lwd = 2, add = TRUE, yaxt = "n", yaxs = "i")
# Generar datos para la curva normal
x <- seq(-3, 3, length.out = 100)
y <- dnorm(x, mean = 0, sd = 1)

# Graficar la curva normal
plot(x, y, type = "l", lwd = 2, col = "blue", 
     main = "Curva Normal Estándar", xlab = "Valores", ylab = "Densidad")
# Parámetros de la distribución de Poisson
lambda <- 3  # Parámetro lambda
# Valores para x (número de eventos)
x <- 0:10
# Probabilidad de la distribución de Poisson
poisson <- dpois(x, lambda)
# Graficar la distribución de Poisson
plot(x, poisson, type = "h", lwd = 10, col = "blue", 
     main = "Distribución de Poisson", 
     xlab = "Número de Eventos", ylab = "Probabilidad")



# Generar datos de una distribución uniforme
datos_uniformes <- runif(1000, min = 0, max = 10)

# Graficar la distribución uniforme
hist(datos_uniformes, breaks = 20, freq = FALSE,
     main = "Distribución Uniforme", xlab = "Valores", ylab = "Densidad", col = "lightblue")












# Generar 1000 números con distribución de Poisson
set.seed(123)  # Para reproducibilidad
n <- 1000
lambda <- 3  # Parámetro lambda de la distribución de Poisson

# Generar números con distribución de Poisson
poisson_numbers <- rpois(n, lambda)

# Mostrar los primeros 10 números generados
print(poisson_numbers[1:1000])





# Generar 100 números con distribución uniforme
set.seed(123)  # Para reproducibilidad
n <- 100
min_value <- 0  # Valor mínimo del rango
max_value <- 10  # Valor máximo del rango

# Generar números con distribución uniforme
uniform_numbers <- runif(n, min = min_value, max = max_value)

# Graficar los números generados
hist(uniform_numbers, breaks = 10, main = "Distribución Uniforme", xlab = "Valor", ylab = "Frecuencia")







# Generar secuencia de valores para x
x <- seq(-4, 4, length.out = 100)

# Calcular los valores de la distribución normal estándar para los valores de x
y <- dnorm(x, mean = 0, sd = 1)

# Graficar la distribución normal estándar
plot(x, y, type = "l", main = "Distribución Normal Estándar", 
     xlab = "Valor", ylab = "Densidad", col = "blue")




# Parámetros de la distribución de Poisson
lambda <- 3  # Parámetro lambda
x <- 0:20  # Valores de x para los cuales se calculará la probabilidad

# Calcular la probabilidad para cada valor de x
poisson_prob <- dpois(x, lambda)

# Graficar la distribución de Poisson
plot(x, poisson_prob, type = "h", lwd = 10, 
     main = "Distribución de Poisson", xlab = "x", ylab = "P(X = x)")

print(1 / 6)

