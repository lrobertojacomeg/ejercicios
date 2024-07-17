library(animation)
vi.grid.illusion()
vi.grid.illusion(type = "h", lwd = 22, nrow = 5, ncol = 5, col = "white")


#chaser
ani.options(nmax = 20)
par(mar = c(1, 1, 1, 1))
vi.lilac.chaser()




#buffon needle
library(animation)
ani.options(nmax = 100, interval = 0.5)
par(mar = c(3, 2.5, 0.5, 0.2), pch = 20, mgp = c(1.5, 0.5, 0))
buffon.needle(mat = matrix(c(1, 2, 1, 3), 2))
