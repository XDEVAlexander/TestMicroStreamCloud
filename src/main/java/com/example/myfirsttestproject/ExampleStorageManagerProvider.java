
package com.example.myfirsttestproject;

import one.microstream.enterprise.cluster.nodelibrary.common.ClusterStorageManager;
import one.microstream.enterprise.cluster.nodelibrary.common.spi.ClusterStorageManagerProvider;
import com.example.myfirsttestproject.storage.MicroStream;
import com.example.myfirsttestproject.storage.DataRoot;

public class ExampleStorageManagerProvider implements ClusterStorageManagerProvider
{
	@Override
	public ClusterStorageManager<DataRoot> provideClusterStorageManager()
	{
		return MicroStream.storage();
	}
}
