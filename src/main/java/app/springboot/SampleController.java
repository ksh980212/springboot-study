package app.springboot;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class SampleController {

	@GetMapping("/hello")
	public EntityModel<Hello> hello() {
		Hello hello = new Hello();
		hello.setPrefix("Hey, ");
		hello.setName("seungho");

		EntityModel<Hello> helloResource = new EntityModel<>(hello);
		helloResource.add(linkTo(methodOn(SampleController.class).hello()).withSelfRel());

		return helloResource;
	}

}
