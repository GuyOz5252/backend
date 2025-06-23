package com.project.backend.api.datafetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.InputArgument;
import com.project.backend.application.alphasource.create.CreateAlphaSourceCommand;
import com.project.backend.codegen.types.CreateAlphaSource;
import com.project.backend.domain.mapper.CreateAlphaSourceMapper;
import com.project.backend.shared.CommandHandler;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@DgsComponent
public class CreateAlphaSourceDatafetcher {

    private final CommandHandler<CreateAlphaSourceCommand, String> createAlphaSourceCommandHandler;
    private final CreateAlphaSourceMapper createAlphaSourceMapper;

    @DgsMutation
    public String createAlphaSource(@InputArgument CreateAlphaSource createAlphaSource) {
        var id = createAlphaSourceCommandHandler
                .handle(new CreateAlphaSourceCommand(createAlphaSourceMapper.map(createAlphaSource)));
        return id.orElse(null);
    }
}
