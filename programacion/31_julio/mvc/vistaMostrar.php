
<?php
//incluye la clase Libro y CrudLibro

require_once('controladorLibro.php');

$controladorLibro= new controladorLibro();
//obtiene todos los libros con el método mostrar de la clase crud
$listaLibros=$controladorLibro->mostrar();
?>
 
<html>
<head>
	<title>Mostrar Libros</title>
</head>
<body>
	<table border=1>
		<head>
			<td>Nombre</td>
			<td>Autor</td>
			<td>Edicion</td>
			<td>Actualizar</td>
			<td>Eliminar</td>
		</head>
		<body>
			<?php foreach ($listaLibros as $libro) {?>
			<tr>
				<td><?php echo $libro->getNombre() ?></td>
				<td><?php echo $libro->getAutor() ?></td>
				<td><?php echo $libro->getAnio_edicion()?> </td>
				<td><a href="vistaActualizar.php?id=<?php echo $libro->getId()?>&accion=a">Actualizar</a> </td>
				<td><a href="controladorLibro.php?id=<?php echo $libro->getId()?>&accion=e">Eliminar</a>   </td>
			</tr>
			<?php }?>
		</body>
	</table>
	<a href="index.php">Volver</a>
</body>
</html>