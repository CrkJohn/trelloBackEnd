package ieti.trello.backend.trello.controller;

import ieti.trello.backend.trello.entities.*;

import java.util.concurrent.atomic.AtomicLong;

import ieti.trello.backend.trello.services.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "v1/task")
public class TaskController {

    private final AtomicLong counter = new AtomicLong();

    @Autowired
	ITaskService task;


	@GetMapping("/allTask")
	public ResponseEntity<?> geTasksList(){
		try {
			return new ResponseEntity<>(task.geTasksList(),HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity<>("ERROR", HttpStatus.NOT_FOUND);
		}
	}



	
}
