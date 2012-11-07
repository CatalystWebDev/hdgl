package hdgl.db.store.impl.hdfs.mapreduce;

import hdgl.util.StringHelper;

import java.io.IOException;


public class EdgeInputStream extends GraphInputStream {
	public EdgeInputStream(long id) throws IOException
	{
		super(id);
		
		int ret = locate(Parameter.OUT_PATH + "/" + Parameter.EDGE_REGULAR_FILE_NAME);
		fileIrr = Parameter.OUT_PATH + "/" + Parameter.EDGE_IRREGULAR_FILE_NAME + "-r-" + StringHelper.fillToLength(ret);
	}

}