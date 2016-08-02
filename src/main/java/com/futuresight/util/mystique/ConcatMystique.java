/*
 * Copyright (c) Balajee TM 2016.
 * All rights reserved.
 */

/*
 * Created on 2 Aug, 2016 by balajeetm
 */
package com.futuresight.util.mystique;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

/**
 * The Class ConcatMystique.
 *
 * @author balajeetm
 */
@Component
public class ConcatMystique implements Mystique {

	/* (non-Javadoc)
	 * @see com.futuresight.util.mystique.Mystique#transform(java.util.List, com.google.gson.JsonObject, java.lang.String)
	 */
	@Override
	public JsonElement transform(List<JsonElement> source, JsonObject deps, String turn) {
		StringBuilder stringBuilder = new StringBuilder();
		if (CollectionUtils.isNotEmpty(source)) {
			for (JsonElement jsonElement : source) {
				stringBuilder.append(StringUtils.strip(jsonElement.toString(), "\""));
			}
		}
		return new JsonPrimitive(stringBuilder.toString());
	}

}