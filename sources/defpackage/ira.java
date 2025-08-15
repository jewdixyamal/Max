package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: ira  reason: default package */
public final class ira implements ActionMode.Callback {
    public final Context a;
    public final g17 b;
    public final int c;
    public final int d;

    public ira(Context context, g17 g17, int i, int i2) {
        this.a = context;
        this.b = g17;
        this.c = i;
        this.d = i2;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence B;
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf == null || valueOf.intValue() != 16908322 || (B = tpa.B(this.a)) == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        int length = B.length();
        for (int i = 0; i < length; i++) {
            char charAt = B.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String obj = w9e.X0(this.d, sb).toString();
        ((jg3) this.b).J0(this.c, obj);
        return obj.length() > 0;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        MenuItem findItem = menu.findItem(16908322);
        if (findItem == null) {
            return false;
        }
        menu.clear();
        menu.add(0, 16908322, 0, findItem.getTitle());
        return true;
    }
}
