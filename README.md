To start Zookeeper Service ->
	zookeeper-server-start.bat ../../config/zookeeper.properties

To start Kafka Server ->
	kafka-server-start.bat ../../config/server.properties
	
To create topic ->
	kafka-topics.sh --create --topic <<topicName>> --bootstrap-server localhost:9092
	
To read the messages inside topic ->
	kafka-console-consumer.bat --topic <<topicName>> --from-beginning --bootstrap-server localhost:9092