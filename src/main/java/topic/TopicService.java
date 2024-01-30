package topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        this.topicRepository.findAll().forEach(topic -> topics.add(topic));
        return topics;
    }

    public Topic getTopic(String id) {
        return this.topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) {
        this.topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        this.topicRepository.save(topic);
    }

    public void removeTopic(String id) {
        this.topicRepository.deleteById(id);
    }
}
