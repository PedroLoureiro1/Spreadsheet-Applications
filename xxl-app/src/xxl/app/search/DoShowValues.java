package xxl.app.search;

import pt.tecnico.uilib.menus.Command;
import xxl.Spreadsheet;
// FIXME import classes

/**
 * Command for searching content values.
 */
class DoShowValues extends Command<Spreadsheet> {

    DoShowValues(Spreadsheet receiver) {
        super(Label.SEARCH_VALUES, receiver);
        addStringField("searchValue", Prompt.searchValue());
        // FIXME add fields
    }

    @Override
    protected final void execute() {
        // FIXME implement command
        _display.popup(_receiver.searchValue(stringField("searchValue")));
    }

}
