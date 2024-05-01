#####################################
# Definir la función para simular un proceso
simular_proceso <- function(id, tiempo_cpu, trabajo_restante) {
  cat("Proceso", id, "en ejecución\n")
  
  Sys.sleep(1)
  if (trabajo_restante > tiempo_cpu){
    trabajo_restante = trabajo_restante - tiempo_cpu
  }else{
    trabajo_restante =0
  }
  
  cat("Proceso", id, " trabajo restante ", trabajo_restante, "\n")
}

# Arreglo de procesos, tasa de completado y tiempo de uso de la CPU
usuario_i <- c("Proceso1", "Proceso2", "Proceso3", "Proceso4", "Proceso5")
tasa_i <- c(3, 6, 2, 8, 7)
tiempo_cpu <- 1.5 # Tiempo de uso de la CPU en segundos

iteracion =1
completado = FALSE
while (completado == FALSE){
  completado = TRUE
  
  
  cat("******************************\nIteracion", iteracion, "\n")
  # Ejecutar los procesos en la cola
  for (i in 1:length(usuario_i)) {
    if (tasa_i[i] > 0) {
      completado = FALSE
      cat("* Ejecutando", usuario_i[i], "\n")
      simular_proceso(usuario_i[i], tiempo_cpu, tasa_i[i])
      if (tasa_i[i] - tiempo_cpu){
        tasa_i[i] = tasa_i[i] - tiempo_cpu  
      }else{
        tasa_i[i] = 0
      }
        
      
      
    }
  }
  iteracion = iteracion +1
}

