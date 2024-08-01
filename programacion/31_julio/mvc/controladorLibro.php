<?php
//incluye la clase Libro y CrudLibro
require_once('modeloLibro.php');


	$libro = new Libro();
	$controladorLibro = new ControladorLibro();
	// si el elemento insertar no viene nulo llama al crud e inserta un libro
	if (isset($_POST['insertar'])) {
		$controladorLibro->insertar($_POST['nombre'], $_POST['autor'], $_POST['edicion']);
		header('Location: index.php');
	// si el elemento de la vista con nombre actualizar no viene nulo, llama al crud y actualiza el libro
	}elseif(isset($_POST['actualizar'])){
		$controladorLibro->actualizar($_POST['id'], $_POST['nombre'], $_POST['autor'], $_POST['edicion']); 		
		header('Location: index.php');
	// si la variable accion enviada por GET es == 'e' llama al crud y elimina un libro
	}elseif (isset($_GET['accion'])){
		if($_GET['accion']=='e') {
			$controladorLibro->eliminar($_GET['id']);
			header('Location: index.php');		
		// si la variable accion enviada por GET es == 'a', envía a la página actualizar.php 
		}elseif ($_GET['accion']=='a'){
			header('Location: vistaActualizar.php' . "?id=" . $_GET['id']);
		}
	}


	class ControladorLibro{				
		function __construct(){}
		
		// método para mostrar todos los libros
		public function mostrar(){
			$libro = new Libro();
			$listaLibros = $libro->mostrar();
			return $listaLibros;
		}

		public function obtenerLibro($id){
			$actLibro= new Libro();
			return $actLibro->obtenerLibro($id);
		}

		public function insertar($nombre, $autor, $edicion){
			$nuevoLibro= new Libro();
			$nuevoLibro->setNombre($nombre);
			$nuevoLibro->setAutor($autor);
			$nuevoLibro->setAnio_edicion($edicion);
			//llama a la función insertar definida en el crud
			$nuevoLibro->insertar($nuevoLibro); 
		}
 
 
		// método para eliminar un libro, recibe como parámetro el id del libro
		public function eliminar($id){
			$eliminarLibro= new Libro();			
			$eliminarLibro->eliminar($id);
		}
 
 
		// método para actualizar un libro, recibe como parámetro el libro
		public function actualizar($id, $nombre, $autor, $edicion){
			$actLibro= new Libro();
			$actLibro->setId($id);
			$actLibro->setNombre($nombre);
			$actLibro->setAutor($autor);
			$actLibro->setAnio_edicion($edicion);
			$actLibro->actualizar($actLibro);
		}

	}	
?>