import java.util.HashMap;
import java.util.Map;

class Data {
    private String type;
    private Object content;

    public Data(String type, Object content) {
        this.type = type;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}

abstract class DataProcessor {
    public abstract void process(Data data);
}

class TextDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        System.out.println("Processing text data: " + data.getContent());
    }
}

class AudioDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        System.out.println("Processing audio data: " + data.getContent());
    }
}

class VideoDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        System.out.println("Processing video data: " + data.getContent());
    }
}

class DataProcessorCreator {
    private DataProcessor processor;

    public void setProcessor(DataProcessor processor) {
        this.processor = processor;
    }

    public void processData(Data data) {
        processor.process(data);
    }
}

class ImageDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        System.out.println("Processing image data: " + data.getContent());
    }
}

class Test {
    public static void main(String[] args) {
        DataProcessorCreator creator = new DataProcessorCreator();

        Map<String, Object> textData = new HashMap<>();
        textData.put("text", "Sample text data");

        Map<String, Object> audioData = new HashMap<>();
        audioData.put("audio", "Sample audio data");

        Map<String, Object> videoData = new HashMap<>();
        videoData.put("video", "Sample video data");

        Data textDataObj = new Data("text", textData);
        Data audioDataObj = new Data("audio", audioData);
        Data videoDataObj = new Data("video", videoData);

        TextDataProcessor textProcessor = new TextDataProcessor();
        creator.setProcessor(textProcessor);
        creator.processData(textDataObj);

        AudioDataProcessor audioProcessor = new AudioDataProcessor();
        creator.setProcessor(audioProcessor);
        creator.processData(audioDataObj);

        VideoDataProcessor videoProcessor = new VideoDataProcessor();
        creator.setProcessor(videoProcessor);
        creator.processData(videoDataObj);

    }
}

