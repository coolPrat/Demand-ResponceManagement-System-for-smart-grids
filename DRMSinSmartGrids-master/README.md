To run the Demand-Response management system's simulation please follow following steps OR <b>*simply watch the video*</b> :

1.  Take usage data for each station in a text file. This is supposed to be weeks usage data. The name of the text file should be <Name of the station>.txt
	  e.g. STN_101.txt
	  The format of the data in this file is
	  day of week, hour:units, e.g. usage info of 356 units utilized on sunday between 16:00 - 17:00 is represented as,
	  Sunday,17:356

2. Run PeakTest.java which will convert this usage information to a CSV file to be used by stations. Stations will use this information to get average
	  utilization for perticular hour.

3. Run Station.java to start Stations.

4. Run Consumers.java to start consumers. Provide station's IP address to consumer so they can connect and request electricity.

5. Request energy by entering integer numbers represting the units. Positive integer represent requesting more energy and negative integers represent
	  giving back (may be you switched off something and now you dont need as much electricity).
	  Monitor Stations as they transfer units between consumers and among themselves as the demand changes.
