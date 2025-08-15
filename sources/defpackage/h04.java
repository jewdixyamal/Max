package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: h04  reason: default package */
public abstract class h04 extends BaseAdapter implements Filterable, i04 {
    public f04 X;
    public g04 Y;
    public j04 Z;
    public boolean a;
    public boolean b;
    public Cursor c;
    public int o;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                f04 f04 = this.X;
                if (f04 != null) {
                    cursor2.unregisterContentObserver(f04);
                }
                g04 g04 = this.Y;
                if (g04 != null) {
                    cursor2.unregisterDataSetObserver(g04);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                f04 f042 = this.X;
                if (f042 != null) {
                    cursor.registerContentObserver(f042);
                }
                g04 g042 = this.Y;
                if (g042 != null) {
                    cursor.registerDataSetObserver(g042);
                }
                this.o = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.o = -1;
                this.a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    public final int getCount() {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            qce qce = (qce) this;
            view = qce.u0.inflate(qce.t0, viewGroup, false);
        }
        a(view, this.c);
        return view;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.widget.Filter, j04] */
    public final Filter getFilter() {
        if (this.Z == null) {
            ? filter = new Filter();
            filter.a = this;
            this.Z = filter;
        }
        return this.Z;
    }

    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.c.getLong(this.o);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.c.moveToPosition(i)) {
            if (view == null) {
                view = d(viewGroup);
            }
            a(view, this.c);
            return view;
        } else {
            throw new IllegalStateException(zr6.h(i, "couldn't move cursor to position "));
        }
    }
}
