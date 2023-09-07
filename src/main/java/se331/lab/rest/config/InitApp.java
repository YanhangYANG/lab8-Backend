package se331.lab.rest.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.lab.rest.entity.Event;
import se331.lab.rest.entity.Org;
import se331.lab.rest.repository.EventRepository;
import se331.lab.rest.repository.OrgRepository;

@Component
@RequiredArgsConstructor
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    final EventRepository eventRepository;
    final OrgRepository orgRepository;
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
                eventRepository.save(Event.builder()
                                .category("Academic")
                                .title("Midterm Exam")
                                .description("A time for taking the exam")
                                .location("CAMT Building")
                                .date("3rd Sept")
                                .time("3.00-4.00 pm.")
                                .petsAllowed(false)
                                .organizer("CAMT").build());
                eventRepository.save(Event.builder()
                                .category("Academic")
                                .title("Commencement Day")
                                .description("A time for celebration")
                                .location("CMU Convention hall")
                                .date("21th Jan")
                                .time("8.00am-4.00 pm.")
                                .petsAllowed(false)
                                .organizer("CMU").build());
                eventRepository.save(Event.builder()
                                .category("Cultural")
                                .title("Loy Krathong")
                                .description("A time for Krathong")
                                .location("Ping River")
                                .date("21th Nov")
                                .time("8.00-10.00 pm.")
                                .petsAllowed(false)
                                .organizer("Chiang Mai").build());
                eventRepository.save(Event.builder()
                                .category("Cultural")
                                .title("Songkran")
                                .description("Let's Play Water")
                                .location("Chiang Mai Moat")
                                .date("13th April")
                                .time("10.00am - 6.00 pm.")
                                .petsAllowed(true)
                                .organizer("Chiang Mai Municipality").build());
                orgRepository.save(Org.builder()
                                .name("CMU")
                                .address("239 Huay Kaew Rd., Muang District, Chiang Mai 50200")
                                .build());
                orgRepository.save(Org.builder()
                                .name("CAMT")
                                .address("abc 4L")
                                .build());
                orgRepository.save(Org.builder()
                                .name("X")
                                .address("abc 1L")
                                .build());
                 orgRepository.save(Org.builder()
                                 .name("N")
                                 .address("abc 2L")
                                 .build());

            }



}


