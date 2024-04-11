# Factory-Method-Pattern-Data
Here's how the code aligns with the Factory Method Pattern:

Abstract Factory (DataProcessor): The DataProcessor class is an abstract class that defines the factory method process(Data data). This method is responsible for creating and processing different types of data.

Concrete Factories (TextDataProcessor, AudioDataProcessor, VideoDataProcessor, ImageDataProcessor): Each concrete subclass of DataProcessor (e.g., TextDataProcessor, AudioDataProcessor, etc.) implements the process(Data data) method to create specific processing modules for different types of data.

Client (Main): The Main class acts as the client. It creates instances of concrete factories (TextDataProcessor, AudioDataProcessor, etc.) and uses them to process data.

Creator (DataProcessorCreator): Although not explicitly labeled as a "creator", the DataProcessorCreator class serves the purpose of managing the creation of processing modules. It sets the concrete processor and invokes its processData(Data data) method to process the data.

Product (Data): The Data class represents the product created by the factory method. It encapsulates the data type and content.
