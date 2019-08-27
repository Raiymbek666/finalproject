package kz.epam.raiymbek.command;

import kz.epam.raiymbek.command.impl.*;

import java.util.EnumMap;

public class CommandManager {
    enum CommandContainer {
        LOGIN,
        TO_LOGIN,
        TO_ADD_CAR,
        EDIT_CAR,
        DELETE_CAR,
        TO_CAR_LIST,
        TO_CABINET,
        ADD_CAR,
        TO_EDIT_CAR,
        TO_SIGN_UP,
        SIGN_UP
    }

    private static CommandManager instance = new CommandManager();
    private EnumMap<CommandContainer, Command> commands = new EnumMap<CommandContainer, Command>(CommandContainer.class);

    private CommandManager() {
        commands.put(CommandContainer.LOGIN, new ToLoginPageCommand());
        commands.put(CommandContainer.TO_LOGIN, new ToLoginPageCommand());
        commands.put(CommandContainer.TO_CAR_LIST, new ToCarListPageCommand());
        commands.put(CommandContainer.TO_ADD_CAR, new ToCarFormPageCommand());
        commands.put(CommandContainer.TO_CABINET, new ToCabinetPageCommand());
        commands.put(CommandContainer.ADD_CAR, new AddCarCommand());
        commands.put(CommandContainer.DELETE_CAR, new DeleteCarCommand());
        commands.put(CommandContainer.TO_EDIT_CAR, new TOEditFormPageCommand());
        commands.put(CommandContainer.EDIT_CAR, new EditCarCommand());
        commands.put(CommandContainer.TO_SIGN_UP, new ToSignUpFormPageCommand());
        commands.put(CommandContainer.SIGN_UP, new SignUpCommand());
    }

    public static CommandManager getInstance(){
        return instance;
    }

    public Command getCommand(String commandName) {
        CommandContainer command = CommandContainer.valueOf(commandName.toUpperCase());
        return commands.get(command);
    }
}
