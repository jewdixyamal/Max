package defpackage;

import android.widget.AbsListView;

/* renamed from: bs4  reason: default package */
public abstract class bs4 {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z) {
        absListView.setSelectedChildViewEnabled(z);
    }
}
