package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

@Deprecated
public class SimpleDraweeView extends na6 {
    public static ide w0;
    public n0 v0;

    public SimpleDraweeView(Context context) {
        super(context);
        l(context, (AttributeSet) null);
    }

    public n0 getControllerBuilder() {
        return this.v0;
    }

    public final void l(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        int resourceId;
        try {
            f46.I();
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                od2.o(w0, "SimpleDraweeView was not initialized!");
                this.v0 = (n0) w0.get();
            }
            if (attributeSet != null) {
                obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w2c.SimpleDraweeView);
                if (obtainStyledAttributes.hasValue(w2c.SimpleDraweeView_actualImageUri)) {
                    m(Uri.parse(obtainStyledAttributes.getString(w2c.SimpleDraweeView_actualImageUri)));
                } else if (obtainStyledAttributes.hasValue(w2c.SimpleDraweeView_actualImageResource) && (resourceId = obtainStyledAttributes.getResourceId(w2c.SimpleDraweeView_actualImageResource, -1)) != -1) {
                    if (isInEditMode()) {
                        setImageResource(resourceId);
                    } else {
                        setActualImageResource(resourceId);
                    }
                }
                obtainStyledAttributes.recycle();
            }
            f46.I();
        } catch (Throwable th) {
            f46.I();
            throw th;
        }
    }

    public final void m(Uri uri) {
        n0 n0Var = this.v0;
        n0Var.d = null;
        e2b e2b = (e2b) n0Var;
        e2b.c(uri);
        e2b.l = getController();
        setController(e2b.a());
    }

    public void setActualImageResource(int i) {
        m(e9f.c(i));
    }

    public void setImageRequest(wv6 wv6) {
        n0 n0Var = this.v0;
        n0Var.e = wv6;
        n0Var.l = getController();
        setController(n0Var.a());
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    public void setImageURI(Uri uri) {
        m(uri);
    }

    public void setImageURI(String str) {
        m(str != null ? Uri.parse(str) : null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l(context, attributeSet);
    }
}
