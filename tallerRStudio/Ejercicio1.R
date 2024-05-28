# operaciones aritmeticas
20+34

sqrt(abs(sin(60)))

30-5
3-6
3*4
50/5
3^2

31 %% 7


#########################################
#trabajar con variables
X = 35
Y = 115
z = X * Y

print(z)


# crear la variable altura
# crear la variable base
# calcular el area del triangulo e imprimir
altura = 445
base = 45456
Area = (base * altura) /2
print(Area)



# calcular el perimetro del circulo
PI = 3.14
radio = 6

perimetro = 2 * PI * radio
print(perimetro)


#####################################################
#trabajar con arreglos
x = c(3, 6, 8, 9,4,5,6,6,7,87,8,8,8,88,8,8,8,67,6,3,5,4,44)
print(x)
print(x * 3)
print(x * x)
print(sqrt(x))

#################################
# secuencias
1:1000
1000:1

x = 1:1000
print(x)
print(2*x)

x = 1:10
print(x)
print(2*x)
print(2*x -1)

# Leer un archivo CSV llamado "datos.csv"
datos <- read.csv("c://tmp/datosInec.csv", header = TRUE, sep = ",", stringsAsFactors = FALSE)



# Mostrar las primeras filas del dataframe
head(datos)


summary(datos)

# Instalar el paquete readr si no está instalado
install.packages("readr")

# Cargar el paquete readr
library(readr)

# Leer un archivo CSV y convertirlo en un dataframe
mi_dataframe <- read_csv("c://tmp/datosInec.csv")

# Mostrar las primeras filas del dataframe
head(mi_dataframe)

# lanzamiento de 1 dado
#evento sigue la distribucion uniforme
P(1) = 1/6 = 0.1666667
P(par) = 3/6 = 1/2

#numeros aleatorios
x = runif(100)
print(x)
print(x*100)
print(as.integer(x*100))

summary(x)   # resumen de un conjunto de numeros
plot(x)   # diagrama de dispersion
hist(x)   #histograma
boxplot(x)



x = runif(100) * 100
print(as.integer(x))

set.seed(320)
sample(6)

## rango
# 1 al 13 brillos
# 13 al 26 corazones rojos
# 27 al 39 corazones negros
# 40 al 52 trebol

baraja = sample(52)
print(baraja)
#baraja[1:5] %% 13

#baraja[10] %% 13

carta = baraja[41] %% 13 +1
palo = carta %% 4

paloBaraja =" "
if (palo ==1) {
  paloBaraja ="Brillos"
} else if (palo==2) {
  paloBaraja ="Corazones rojos"
} else if (palo==3) {
  paloBaraja ="Corazones negros"
  } else {
    paloBaraja ="Treboles"
}

paste(carta, " de ", paloBaraja)

summary(x)
var(x)
sd(x)

rpois(10, 3)


demo(graphics)

##############################################
data()

x = data(euro)
iris["Sepal.Length"]

summary(iris["Sepal.Length"])
boxplot(iris["Sepal.Length"])

head(iris)
print(iris)

summary(iris["Sepal.Width"])
boxplot(iris["Sepal.Width"])


install.packages("GGally")
library(GGally)

# Crear la matriz de correlación
ggpairs(iris)

#ejemplo de correlacion en criptomonedas
#cuando sube el precio de la moneda theta sube luego el valor de tfuel

#modelo lineal simple
modelo <- lm(Sepal.Width ~ Sepal.Length, data = iris)
summary(modelo)

# Gráfico de dispersión
plot(iris["Sepal.Length"])

# Añadir la línea de regresión
abline(modelo, col = "red", lwd = 2)

nuevos_datos <- data.frame(X1 = 35)
prediccion_ingreso <- predict(modelo, nuevos_datos)
print(prediccion_ingreso)






# Cargar el dataset iris
data(iris)

# Crear el diagrama de dispersión usando R base
plot(iris$Petal.Length, iris$Petal.Width,
     main = "Diagrama de Dispersión de Ancho y Largo del Pétalo",
     xlab = "Largo del Pétalo",
     ylab = "Ancho del Pétalo",
     col = iris$Species,   # Usar diferentes colores para cada especie
     pch = 19)             # Usar círculos sólidos como puntos
legend("topright", legend = levels(iris$Species), col = 1:3, pch = 19)

