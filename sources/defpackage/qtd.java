package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.EditText;

/* renamed from: qtd  reason: default package */
public final class qtd extends hdc {
    public static final /* synthetic */ bc7[] s0;
    public final g17 X;
    public final k56 Y;
    public final yj Z = new yj(this);
    public final int o;

    static {
        oi9 oi9 = new oi9(qtd.class, "isSecure", "isSecure()Z");
        nec.a.getClass();
        s0 = new bc7[]{oi9};
    }

    public qtd(int i, g17 g17, qk2 qk2) {
        this.o = i;
        this.X = g17;
        this.Y = qk2;
    }

    public final int j() {
        return this.o;
    }

    public final void r(dec dec, int i) {
        ptd ptd = (ptd) dec;
        bc7 bc7 = s0[0];
        boolean booleanValue = ((Boolean) this.Z.b).booleanValue();
        eg3 eg3 = ptd.H0;
        eg3.setSecure(booleanValue);
        eg3.addTextChangedListener(new otd(ptd, i));
        eg3.setOnKeyListener(new ntd(ptd, i));
        ira ira = new ira(eg3.getContext(), ptd.G0, i, ptd.F0);
        eg3.setCustomSelectionActionModeCallback(ira);
        eg3.setCustomInsertionActionModeCallback(ira);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [eg3, android.widget.TextView, android.view.View, android.widget.EditText] */
    public final dec t(ViewGroup viewGroup, int i) {
        ? editText = new EditText(viewGroup.getContext(), (AttributeSet) null);
        editText.setId(vwb.one_me_codeinput_edit_text_view);
        editText.setMinimumWidth(tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density));
        editText.setMinimumHeight(tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density));
        editText.setInputType(2);
        editText.setGravity(17);
        editText.setFilters(new InputFilter[]{eg3.c});
        i4f.b.b(editText, du4.b);
        editText.setClipToOutline(true);
        editText.setOutlineProvider(new ix3((float) tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density)));
        editText.setSingleLine(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density), editText.getLineHeight());
        editText.setTextCursorDrawable(gradientDrawable);
        editText.onThemeChanged(qp4.u0.j(editText));
        editText.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return new ptd(this, this.o, this.X, editText);
    }
}
