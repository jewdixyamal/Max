package ru.ok.messages.media.attaches;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;

public class MessageAttachmentsLayout extends ViewGroup {
    public final ts8 a;
    public final SimpleDraweeView b;
    public final rz c;
    public final ed3 o = vl.b();

    static {
        vl.o.getResources().getDimension(jtb.message_max_attach_width);
        vl.o.getResources().getDimension(jtb.message_min_attach_height);
    }

    public MessageAttachmentsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        bk4.b();
        ((y8a) this.o).d();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.b = simpleDraweeView;
        ((la6) simpleDraweeView.getHierarchy()).h(ssc.l);
        this.c = new rz(this.b, (qz) null);
        this.o.a(10, 2);
        tu0.K(this.b, 1000, new xx5(15, this));
        this.b.setOnLongClickListener(new zl0(4, this));
        addView(this.b, new FrameLayout.LayoutParams(-1, -1));
        ts8 ts8 = new ts8(getContext());
        this.a = ts8;
        ts8.setId(xxb.view_message__view_attaches);
        addView(this.a);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public ts8 getView() {
        return this.a;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rz rzVar = this.c;
        if (rzVar != null) {
            rzVar.i();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rz rzVar = this.c;
        if (rzVar != null) {
            cqc.b(rzVar.t);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void onMeasure(int i, int i2) {
        this.a.measure(i, i2);
        setMeasuredDimension(this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
    }
}
