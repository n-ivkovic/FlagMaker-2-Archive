package flagmaker.Overlays.OverlayTypes.PathTypes;

import flagmaker.Vector;

public class OverlayCoronet extends OverlayPath
{
	private final String Path = "m 63.673978,-44.799664 c -5.926,-0.843 -12.469,2.489 -14.576,7.483 -1.512,3.571 -0.358,7.043 0.489,10.039 -3.834,0.211 -8.335,0.823 -11.123,3.353 -4.528,3.268 -5.1,9.146 -3.473,13.887 2.566,6.541 9.173,7.696 15.563,7.385 0.113,7.8980001 -5.261,11.046 -9.479,11.046 -5.136,0 -8.784,-2.11 -12.101,-7.862 -3.51,5.896 -8.705,7.862 -13.647,7.862 -6.6839999,0 -13.2259999,-7.738 -12.5209999,-15.346 2.902,1.474 6.755,3.677 12.0269999,3.677 5.276,0 11.749,-4.159 11.749,-12.952 0,-11.396 -13.718,-12.028 -15.548,-10.69 0.845,-2.041 2.674,-4.996 1.407,-9.867 -0.574,-2.213 -4.4399999,-8.565 -11.8909999,-8.565 -8.6160001,0 -11.3530001,8.565 -11.3530001,8.565 -1.521,4.309 -0.115,7.053 1.292,9.867 -2.674,-1.408 -15.829,-1.27 -16.051,10.69 -0.181,9.649 6.755,12.952 11.478,12.952 4.725,0 9.5680001,-2.307 12.1240001,-3.677 0.933,6.318 -5.582,15.346 -13.3910001,15.346 -6.19,0 -9.267,-3.3329999 -12.17,-7.862 -2.207,4.6380001 -5.698,7.862 -11.772,7.862 -6.096,0 -9.847,-6.2 -11.125,-11.046 5.229,0.631 11.041,-0.313 14.76,-4.104 5.813,-5.159 4.184,-15.065 -3.021,-18.544 -3.137,-1.896 -6.979,-2.184 -10.579,-1.975 0.696,-3.477 1.498,-6.773 -0.129,-10.039 -1.858,-5.479 -8.693,-8.011 -14.502,-7.482 2.832,20.689 6.438,41.271 9.968,61.869 h 107.62 l 9.97,-61.87 z m -117.1,64.65 4.146,25.604 h 98.086 c 1.673,-8.597 3.156,-16.941 4.489,-25.604 h -106.72 z";
	private final Vector PathSize = new Vector(128, 92);
	
	public OverlayCoronet(int maximumX, int maximumY)
	{
		super("coronet", maximumX, maximumY);
		Constructor(Path, PathSize);
	}	
}
