package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: pl7  reason: default package */
public final class pl7 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ ql7 b;

    public pl7(ql7 ql7) {
        this.b = ql7;
        a();
    }

    public final void a() {
        wq8 wq8 = this.b.c;
        br8 br8 = wq8.G0;
        if (br8 != null) {
            wq8.i();
            ArrayList arrayList = wq8.u0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((br8) arrayList.get(i)) == br8) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    /* renamed from: b */
    public final br8 getItem(int i) {
        ql7 ql7 = this.b;
        wq8 wq8 = ql7.c;
        wq8.i();
        ArrayList arrayList = wq8.u0;
        ql7.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (br8) arrayList.get(i);
    }

    public final int getCount() {
        ql7 ql7 = this.b;
        wq8 wq8 = ql7.c;
        wq8.i();
        int size = wq8.u0.size();
        ql7.getClass();
        return this.a < 0 ? size : size - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            ql7 ql7 = this.b;
            view = ql7.b.inflate(ql7.X, viewGroup, false);
        }
        ((pr8) view).d(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
