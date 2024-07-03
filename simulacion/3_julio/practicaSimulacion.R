#vectores
x<-c(1,2,3,4,5)
y<-c(2,1,5,4,3)

#covarianza
cov(x,y)

#correlacion
cor(x,y)

#aleatorios con distribucion uniforme
set.seed(32078) 
runif(10)
set.seed(32078)
runif(10, min=3, max=7)
set.seed(32078)
runif(10, min=-2, max=2)

#aleatorios con funcion sample con y sin reemplazamiento
sample(1:100, size=50, replace=FALSE)
sample(1:100, size=50, replace=TRUE)


#simular lanzamiento de 1 dado
sample(1:6,1)

#Supongamos una urna con 3 bolas blancas y 7 negras, simular la extracción de una 
#bola (asignar, por ejemplo, el 1 a bola blanca y 0 a negra)
sample(c(1,0), 1, prob=c(0.3,0.7))

#Si queremos simular 8 extracciones con reemplazamiento
sample(c(1,0), 8, rep=T, prob=c(0.3,0.7))

#distribucion binomial
#La distribución binomial es una distribución de probabilidad discreta que describe el número de éxitos en una secuencia de 
#n ensayos independientes, donde cada ensayo tiene dos posibles resultados: éxito o fracaso. Cada ensayo tiene la misma probabilidad de éxito 
#p

#dbinom proporciona la función masa de probabilidad
#pbinom proporciona la función de distribución
#qbinom proporciona la función de cuantiles
#rbinom genera valores aleatorios.

#dbinom(x, size, prob, log = FALSE)
#pbinom(q, size, prob, lower.tail = TRUE, log.p = FALSE)
#qbinom(p, size, prob, lower.tail = TRUE, log.p = FALSE)
#rbinom(n, size, prob)

#Calcular la probabilidad de obtener cuatro caras al lanzar seis veces una moneda 
#perfecta
dbinom(x=4, size=6, prob=0.5)


#Supongamos que el 10% de los tubos producidos por una máquina son defectuosos 
#y supongamos que produce 15 tubos cada hora. Cada tubo es independiente de los 
#otros. Se juzga que el proceso está fuera de control cuando se producen más de 4 
#tubos defectuosos en una hora concreta. Simular el número de tubos defectuosos 
#producidos por la máquina en cada hora a lo largo de un periodo de 24 horas y 
#determinar si el proceso está fuera de control en algún momento.
TubosDefectuosos<-rbinom(24,15,0.1)
TubosDefectuosos

any(TubosDefectuosos>4)

sum(TubosDefectuosos>4)


#Supongamos que en un proceso de manufactura la proporción de defectuosos es 
#0.15. Simular el número de defectuosos por hora en un periodo de 24 horas si se 
#supone que se fabrican 25 unidades cada hora. Chequear si el número de 
#defectuosos excede en alguna ocasión a 5. Repetir el procedimiento con p=0.2 y 
#p=0.25.
Defectuosos<-rbinom(24,25,0.15)
Defectuosos
any(Defectuosos>5)
sum(Defectuosos>5)


#Usar ranbin() para similar vectores de longitud 1000, 10000 y 100000 de una 
#distribución B(10,0.5). Usar la función system.time() para comparar los tiempos de 
#ejecución para esas simulaciones con los tiempos de ejecución correspondientes 
#cuando se usa rbinom().
system.time(rbinom(1000,10,0.5))
system.time(rbinom(10000,10,0.5))
system.time(rbinom(100000,10,0.5))
system.time(rbinom(1000000,10,0.5))

#DISTRIBUCIÓN DE POISSON

#dpois proporciona la función masa de probabilidad
#ppois proporciona la función de distribución
#qpois proporciona la función de cuantiles
#rpois genera valores aleatorios

#dpois(x, lambda)
#ppois(q, lambda, lower.tail = TRUE)
#qpois(p, lambda, lower.tail = TRUE)
#rpois(n, lambda)

#Supongamos que el número de accidentes que ocurren en una carretera al año 
#tiene una distribución de Poisson de media 3.7. 
#a) Calcular la probabilidad de que en un año haya 6 accidentes.
#b) Calcular la probabilidad de que un año haya menos de 2 accidentes
#c) Calcular la probabilidad de que un año haya más de 8 accidentes.
#d) Calcular el número máximo de accidentes que se producirán con probabilidad 
#mayor o igual a 0.9.
#e) Simula el número anual de accidentes que se producirán en un periodo de 20 
#años.
#a)
dpois(6,3.7)

#b)
ppois(2,3.7)

#c)
ppois(8,3.7,lower.tail=FALSE)
#d)
qpois(0.9,3.7)
#e)
rpois(20,3.7)

#distribucion normal
options(width=80)
set.seed(111) 
datos<-rnorm(100,3,2)
datos
hist(datos, freq=FALSE)

curve(dnorm(x,3,2),add=TRUE)


#Simular 1000 valores de una exp(3) y comparar su histograma con la 
#función de densidad teórica de la distribución
set.seed(111)
x<-runif(1000)
datos = -(log(1-x))/3
hist(datos, freq=FALSE)
curve(dexp(x,3),add=TRUE)

