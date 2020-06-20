package com.structurizr.dsl;

import com.structurizr.Workspace;

final class WorkspaceParser extends AbstractParser {

    private static final int NAME_INDEX = 1;
    private static final int DESCRIPTION_INDEX = 2;

    void parse(Workspace workspace, Tokens tokens) {
        if (!tokens.includes(NAME_INDEX)) {
            // there is no metadata to set
            return;
        }

        if (tokens.includes(NAME_INDEX)) {
            workspace.setName(tokens.get(NAME_INDEX));
        }

        if (tokens.includes(DESCRIPTION_INDEX)) {
            workspace.setDescription(tokens.get(DESCRIPTION_INDEX));
        }
    }

}