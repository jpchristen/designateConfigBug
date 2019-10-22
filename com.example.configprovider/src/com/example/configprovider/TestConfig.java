package com.example.configprovider;

import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = TestConfig.PID)
public @interface TestConfig
{
   String PID = "com.example.test.config";
}