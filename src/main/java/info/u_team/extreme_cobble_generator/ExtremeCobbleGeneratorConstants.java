package info.u_team.extreme_cobble_generator;

import org.apache.logging.log4j.*;

public class ExtremeCobbleGeneratorConstants {
	
	public static final String MODID = "extremecobblegenerator";
	public static final String NAME = "Extreme Cobble Generator";
	public static final String VERSION = "${version}";
	public static final String MCVERSION = "${mcversion}";
	public static final String DEPENDENCIES = "required:forge@[14.23.4.2705,);required-after:uteamcore@[2.0.0.81,);";
	public static final String UPDATEURL = "https://api.u-team.info/update/extremecobblegenerator.json";
	
	public static final String COMMONPROXY = "info.u_team.extreme_cobble_generator.proxy.CommonProxy";
	public static final String CLIENTPROXY = "info.u_team.extreme_cobble_generator.proxy.ClientProxy";
	
	public static final Logger LOGGER = LogManager.getLogger(NAME);
	
	private ExtremeCobbleGeneratorConstants() {
	}
	
}
