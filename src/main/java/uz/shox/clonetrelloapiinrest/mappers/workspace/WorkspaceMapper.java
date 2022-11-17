package uz.shox.clonetrelloapiinrest.mappers.workspace;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import uz.shox.clonetrelloapiinrest.domains.workspace.Workspace;
import uz.shox.clonetrelloapiinrest.dto.workspace.WorkspaceCreateDto;
import uz.shox.clonetrelloapiinrest.dto.workspace.WorkspaceDto;
import uz.shox.clonetrelloapiinrest.dto.workspace.WorkspaceMemberDto;
import uz.shox.clonetrelloapiinrest.dto.workspace.WorkspaceUpdateDto;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 20:50 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Mapper
public interface  WorkspaceMapper {
    Workspace fromWorkspaceCreateDto(WorkspaceCreateDto workspaceCreateDto);

    @Mapping(target = "createdBy",source = "createdBy.id")
    WorkspaceDto fromWorkSpace(Workspace workspace);

    WorkspaceUpdateDto  fromAddMemberToUpdate(WorkspaceMemberDto workspaceMemberDto);
}
