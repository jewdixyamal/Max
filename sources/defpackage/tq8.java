package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: tq8  reason: default package */
public final class tq8 extends BaseAdapter {
    public final LayoutInflater X;
    public final int Y;
    public final wq8 a;
    public int b = -1;
    public boolean c;
    public final boolean o;

    public tq8(wq8 wq8, LayoutInflater layoutInflater, boolean z, int i) {
        this.o = z;
        this.X = layoutInflater;
        this.a = wq8;
        this.Y = i;
        a();
    }

    public final void a() {
        wq8 wq8 = this.a;
        br8 br8 = wq8.G0;
        if (br8 != null) {
            wq8.i();
            ArrayList arrayList = wq8.u0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((br8) arrayList.get(i)) == br8) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    /* renamed from: b */
    public final br8 getItem(int i) {
        ArrayList arrayList;
        boolean z = this.o;
        wq8 wq8 = this.a;
        if (z) {
            wq8.i();
            arrayList = wq8.u0;
        } else {
            arrayList = wq8.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (br8) arrayList.get(i);
    }

    public final int getCount() {
        ArrayList arrayList;
        boolean z = this.o;
        wq8 wq8 = this.a;
        if (z) {
            wq8.i();
            arrayList = wq8.u0;
        } else {
            arrayList = wq8.l();
        }
        return this.b < 0 ? arrayList.size() : arrayList.size() - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.X.inflate(this.Y, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        pr8 pr8 = (pr8) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        pr8.d(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
