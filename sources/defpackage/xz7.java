package defpackage;

import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.NoSuchElementException;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: xz7  reason: default package */
public final class xz7 implements ActionMode.Callback {
    public final EditText a;
    public final y8 b;
    public final HashSet c = new HashSet();

    public xz7(EditText editText, y8 y8Var) {
        this.a = editText;
        this.b = y8Var;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        EditText editText = this.a;
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        Editable text = editText.getText();
        int i = 0;
        if (!(text == null || text.length() == 0)) {
            int itemId = menuItem.getItemId();
            if (itemId == zxb.markdown_bold) {
                kp.u(text, selectionStart, selectionEnd, false, new wp0(0));
                actionMode.finish();
                return true;
            } else if (itemId == zxb.markdown_italic) {
                kp.u(text, selectionStart, selectionEnd, false, new wp0(1));
                actionMode.finish();
                return true;
            } else if (itemId == zxb.markdown_underline) {
                kp.u(text, selectionStart, selectionEnd, true, new l9e(1));
                actionMode.finish();
                return true;
            } else if (itemId == zxb.markdown_mono) {
                kp.u(text, selectionStart, selectionEnd, true, new gc9());
                actionMode.finish();
                return true;
            } else if (itemId == zxb.markdown_strikethrough) {
                kp.u(text, selectionStart, selectionEnd, true, new l9e(0));
                actionMode.finish();
                return true;
            } else if (itemId == zxb.markdown_code) {
                kp.u(text, selectionStart, selectionEnd, false, new t43());
                actionMode.finish();
                return true;
            } else if (itemId == zxb.markdown_link) {
                y8 y8Var = this.b;
                if (y8Var != null) {
                    ek7[] ek7Arr = (ek7[]) text.getSpans(selectionStart, selectionEnd, ek7.class);
                    if (ek7Arr != null && ek7Arr.length != 0) {
                        while (true) {
                            if (i >= ek7Arr.length) {
                                bc7[] bc7Arr = MessageWriteWidget.F0;
                                zz7 zz7 = (zz7) ((MessageWriteWidget) y8Var.a).c.getValue();
                                zz7.getClass();
                                pnf.o(zz7.c, new w9(selectionStart, selectionEnd, (String) null));
                                break;
                            }
                            int i2 = i + 1;
                            try {
                                ek7 ek7 = ek7Arr[i];
                                int spanStart = text.getSpanStart(ek7);
                                int spanEnd = text.getSpanEnd(ek7);
                                if (spanStart == selectionStart && spanEnd == selectionEnd) {
                                    String str = ek7.b;
                                    bc7[] bc7Arr2 = MessageWriteWidget.F0;
                                    zz7 zz72 = (zz7) ((MessageWriteWidget) y8Var.a).c.getValue();
                                    zz72.getClass();
                                    pnf.o(zz72.c, new w9(selectionStart, selectionEnd, str));
                                    break;
                                }
                                i = i2;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                throw new NoSuchElementException(e.getMessage());
                            }
                        }
                    } else {
                        bc7[] bc7Arr3 = MessageWriteWidget.F0;
                        zz7 zz73 = (zz7) ((MessageWriteWidget) y8Var.a).c.getValue();
                        zz73.getClass();
                        pnf.o(zz73.c, new w9(selectionStart, selectionEnd, (String) null));
                    }
                }
                return true;
            } else if (itemId == zxb.markdown_heading) {
                kp.u(text, selectionStart, selectionEnd, true, new ej6());
                actionMode.finish();
                return true;
            } else if (itemId == zxb.markdown_regular) {
                yz7[] yz7Arr = (yz7[]) text.getSpans(selectionStart, selectionEnd, yz7.class);
                if (yz7Arr.length != 0) {
                    int length = yz7Arr.length;
                    while (i < length) {
                        kp.v(text, yz7Arr[i], selectionStart, selectionEnd);
                        i++;
                    }
                }
                actionMode.finish();
                return true;
            } else if (!(itemId == 16908320 || itemId == 16908321)) {
                hm9.m("xz7", String.format(Locale.ENGLISH, "Unidentified item with id = %d", Arrays.copyOf(new Object[]{Integer.valueOf(menuItem.getItemId())}, 1)), new Object[0]);
            }
        }
        return false;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        HashSet hashSet = this.c;
        hashSet.clear();
        hashSet.add(16908320);
        hashSet.add(16908321);
        sz7.c.getClass();
        for (sz7 sz7 : sz7.X) {
            int i = sz7.a;
            menu.add(zxb.markdown_group, i, 0, this.a.getResources().getString(sz7.b)).setShowAsAction(0);
            hashSet.add(Integer.valueOf(i));
        }
        return true;
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        this.c.clear();
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        pk5 pk5 = new pk5(l6d.Z(new at(4, menu), new wz7(0, this)));
        while (pk5.hasNext()) {
            menu.removeItem(((MenuItem) pk5.next()).getItemId());
        }
        return true;
    }
}
