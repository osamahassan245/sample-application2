package com.vodafone.repository.search;

import com.vodafone.domain.JobHistory;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link JobHistory} entity.
 */
public interface JobHistorySearchRepository extends ElasticsearchRepository<JobHistory, Long> {
}
