package com.example.configconsumer;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.metatype.annotations.Designate;

import com.example.configprovider.TestConfig;

@Designate(ocd = TestConfig.class)
@Component(configurationPolicy = ConfigurationPolicy.REQUIRE, configurationPid = TestConfig.PID)
public class TestClass
{

}