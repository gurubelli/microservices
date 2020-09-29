package com.gurubelli.surya.core;

import static io.dropwizard.testing.FixtureHelpers.fixture;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.dropwizard.jackson.Jackson;

public class PersonTest {

	private static final ObjectMapper MAPPER = Jackson.newObjectMapper();

	@Test
	public void serializeToJSON() throws IOException {

		final Person person = new Person("Hasitha Gurubelli", "hassi.gurubelli@gmail.com");
		final String expected = MAPPER.writeValueAsString(MAPPER.readValue(fixture("fixtures/person.json"), Person.class));
		assertThat(MAPPER.writeValueAsString(person)).isEqualTo(expected);
	}

}
