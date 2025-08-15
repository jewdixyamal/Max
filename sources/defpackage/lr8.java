package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: lr8  reason: default package */
public final class lr8 extends es4 {
    public final int A0;
    public final int B0;
    public ar8 C0;
    public br8 D0;

    public lr8(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.A0 = 21;
            this.B0 = 22;
            return;
        }
        this.A0 = 22;
        this.B0 = 21;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r2 = (r2 = pointToPosition((int) r5.getX(), (int) r5.getY())) - r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onHoverEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            ar8 r0 = r4.C0
            if (r0 == 0) goto L_0x005a
            android.widget.ListAdapter r0 = r4.getAdapter()
            boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
            if (r1 == 0) goto L_0x0019
            android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
            int r1 = r0.getHeadersCount()
            android.widget.ListAdapter r0 = r0.getWrappedAdapter()
            tq8 r0 = (defpackage.tq8) r0
            goto L_0x001c
        L_0x0019:
            tq8 r0 = (defpackage.tq8) r0
            r1 = 0
        L_0x001c:
            int r2 = r5.getAction()
            r3 = 10
            if (r2 == r3) goto L_0x0043
            float r2 = r5.getX()
            int r2 = (int) r2
            float r3 = r5.getY()
            int r3 = (int) r3
            int r2 = r4.pointToPosition(r2, r3)
            r3 = -1
            if (r2 == r3) goto L_0x0043
            int r2 = r2 - r1
            if (r2 < 0) goto L_0x0043
            int r1 = r0.getCount()
            if (r2 >= r1) goto L_0x0043
            br8 r1 = r0.getItem(r2)
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            br8 r2 = r4.D0
            if (r2 == r1) goto L_0x005a
            wq8 r0 = r0.a
            if (r2 == 0) goto L_0x0051
            ar8 r3 = r4.C0
            r3.h(r0, r2)
        L_0x0051:
            r4.D0 = r1
            if (r1 == 0) goto L_0x005a
            ar8 r2 = r4.C0
            r2.k(r0, r1)
        L_0x005a:
            boolean r4 = super.onHoverEvent(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr8.onHoverEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.A0) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.B0) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (tq8) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (tq8) adapter).a.c(false);
            return true;
        }
    }

    public void setHoverListener(ar8 ar8) {
        this.C0 = ar8;
    }

    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
