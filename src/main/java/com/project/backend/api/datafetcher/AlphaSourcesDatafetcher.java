package com.project.backend.api.datafetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.project.backend.codegen.types.AlphaSource;

import java.util.List;

@DgsComponent
public class AlphaSourcesDatafetcher {
    @DgsQuery
    public List<AlphaSource> alphaSources() {
        return List.of();
    }
}
