package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements vq8, qr8, AdapterView.OnItemClickListener {
    public static final int[] b = {16842964, 16843049};
    public wq8 a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        k8g x = k8g.x(context, attributeSet, b, 16842868, 0);
        TypedArray typedArray = (TypedArray) x.b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(x.n(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(x.n(1));
        }
        x.z();
    }

    public final boolean a(br8 br8) {
        return this.a.q(br8, (or8) null, 0);
    }

    public final void b(wq8 wq8) {
        this.a = wq8;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((br8) getAdapter().getItem(i));
    }
}
