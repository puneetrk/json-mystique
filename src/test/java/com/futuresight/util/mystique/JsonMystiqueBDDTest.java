/*
 * Copyright (c) Balajee TM 2016.
 * All rights reserved.
 * License -  @see <a href="http://www.apache.org/licenses/LICENSE-2.0"></a>
 */

/*
 * Created on 17 Nov, 2016 by balajeetm
 */
package com.futuresight.util.mystique;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.futuresight.util.mystique.config.JsonMystiqueConfig;

/**
 * The Class JsonMystiqueBDDTest.
 *
 * @author balajeetm
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = {JsonMystiqueConfig.class})
public class JsonMystiqueBDDTest extends JsonMystiqueNegativeBDD {

	/**
	 * Instantiates a new json mystique negative bdd test.
	 */
	public JsonMystiqueBDDTest() {
	}

	/**
	 * Inits the.
	 */
	@Before
	public void init() {
	}
}
