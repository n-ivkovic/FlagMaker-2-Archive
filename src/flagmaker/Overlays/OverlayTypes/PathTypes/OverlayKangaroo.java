package flagmaker.Overlays.OverlayTypes.PathTypes;

import flagmaker.Vector;

public class OverlayKangaroo extends OverlayPath
{
	private final String Path = "m -49.865052,54.579355 c 0.64214,-1.04337 1.53796,-2.32387 1.9907,-2.84556 4.2939,-4.94775 5.60488,-5.92836 12.90243,-9.65088 12.56144,-6.40767 14.92905,-8.24216 17.64541,-13.67225 1.80248,-3.60318 4.46638,-20.04889 4.48149,-27.66663 0.0043,-2.1843101 -0.37716,-2.9867301 -2.31471,-4.8686701 -2.30965,-2.24335 -2.34459,-2.2532 -7.90432,-2.22678 -5.49099,0.02609 -5.58442,0.05234 -5.58442,1.56916 0,0.84845 0.40382,2.5091 0.89738,3.69034 0.49355,1.18124 1.09796,3.7532201 1.34313,5.7155101 0.29971,2.39878 0.95646,4.17473 2.00439,5.42012 1.99683,2.37309 3.97559,2.48198 3.97559,0.21877 0,-2.30767 1.53246,-1.60026 1.77356,0.8187 0.14744,1.47926 -0.20673,2.2475 -1.50805,3.27112 -3.44014,2.70601 -5.59194,1.42981 -11.21437,-6.65108 -3.93243,-5.65192 -6.34427,-7.2665401 -12.1169,-8.1117701 -4.34668,-0.63645 -6.75538,-1.99904 -14.583903,-8.25011 -3.72839,-2.9771199 -7.37954,-5.7343999 -8.11366,-6.1272799 -0.79338,-0.42461 -5.55555,-0.78412 -11.74109,-0.88639 -10.03919,-0.16597 -10.44535,-0.22366 -11.51221,-1.63521 -0.60824,-0.80474 -1.23967,-1.97218 -1.40319,-2.59432 -0.35827,-1.36311 1.61769,-3.34663 3.90602,-3.92097 2.76331,-0.69354 7.04675,-2.82687 12.35245,-6.15202 2.77408,-1.73856 5.84234,-3.43939 6.81834,-3.77963 0.97601,-0.34024 2.99282,-1.76113 4.48181,-3.15756 2.48267,-2.32831 8.13992,-5.46268 11.780613,-6.52699 1.32917,-0.38856 1.43878,-0.27814 1.04334,1.05103 -0.98577,3.31345 -3.636653,6.17247 -7.644563,8.24481 -2.22658,1.15127 -4.04937,2.30338 -4.05065,2.56023 -0.0039,0.77555 7.76517,6.17582 8.81893,6.13004 0.53905,-0.02342 3.503903,-0.8107 6.588553,-1.74952 l 5.60848,-1.70694 3.24436,-5.92998 c 4.47769,-8.18424 9.74354,-13.4957 17.09075,-17.2388 6.55245,-3.33819 10.8226896,-4.4006 17.7708796,-4.42127 9.15406,-0.02724 13.2651904,1.60901 23.0428304,9.17118 4.08746,3.1613 11.43561,9.22739 12.05233,9.94952 1.01836,1.19241 16.84016,13.40548 20.55123,15.86379 14.37783,9.52426 24.78636,11.24454 31.78566,5.25339 2.554899,-2.1869 4.574189,-6.81601 4.574189,-10.48609 0,-1.00344 0.25371,-1.82442 0.56379,-1.82442 1.7852,0 1.37246,8.80038 -0.59315,12.6469 -1.46151,2.86006 -5.918489,7.1104399 -9.146249,8.7222799 -9.5898,4.78885 -27.70458,0.40057 -45.67211,-11.0639999 -5.68255,-3.62587 -7.25185,-3.49096 -12.81323,1.10159 -5.35291,4.42039 -11.0657,8.1986999 -16.1248004,10.6645799 -5.06095005,2.46677 -7.05114,4.09124 -8.53987,6.97051 -2.1297,4.1189501 -3.8921102,17.8523001 -3.3851702,26.3785801 0.24633,4.14311 0.10585,5.19918 -0.84558,6.35691 -0.62754,0.76361 -5.6938694,3.90573 -11.2585094,6.9825 -10.52347,5.81857 -15.39814,8.97705 -19.48087,12.62234 -1.71124,1.5279 -2.7716,2.03405 -3.66633,1.75008 -0.69233,-0.21974 -1.6773,-0.05218 -2.18882,0.37233 -0.74663,0.61966 -1.17839,0.54711 -2.18949,-0.36793 -1.21903,-1.10321 -1.31401,-1.09079 -2.9597,0.38699 l -1.70024,1.52678 z";
	private final Vector PathSize = new Vector(184, 114);

	public OverlayKangaroo(int maximumX, int maximumY)
	{
		super("kangaroo", maximumX, maximumY);
		Constructor(Path, PathSize);
	}
}
