package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;

/* renamed from: sf9  reason: default package */
public final class sf9 extends ConstraintLayout {
    public final yia G0;
    public final TextView H0;
    public final TextView I0;

    public sf9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        yia yia = new yia(context);
        yia.setId(y7a.S1);
        float f = (float) 40;
        yia.setAvatarSize(tu0.G(fk4.d().getDisplayMetrics().density * f));
        this.G0 = yia;
        TextView textView = new TextView(context);
        textView.setId(y7a.V1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        pq9 pq9 = qp4.u0;
        textView.setTextColor(pq9.p(textView).c.getText().e);
        i4f.j.b(textView, du4.b);
        textView.setSingleLine();
        this.H0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(y7a.U1);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine();
        textView2.setTextColor(pq9.p(textView2).c.getText().g);
        i4f.m.b(textView2, du4.b);
        this.I0 = textView2;
        ImageView imageView = new ImageView(context);
        imageView.setId(y7a.T1);
        imageView.setImageResource(woc.G0);
        int G = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
        imageView.setPadding(G, G, G, G);
        imageView.setImageTintList(ColorStateList.valueOf(pq9.p(imageView).c.getIcon().j));
        float f2 = (float) 12;
        float f3 = (float) 6;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        addView(yia, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        addView(textView, new ti3(-2, -2));
        addView(textView2, new ti3(-2, -2));
        float f4 = (float) 24;
        addView(imageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f4 * fk4.d().getDisplayMetrics().density)));
        setLayoutParams(new ti3(-1, tu0.G(((float) 60) * fk4.d().getDisplayMetrics().density)));
        dj3 q = fp3.q(this);
        int id = yia.getId();
        q.d(id, 4, 0, 4);
        q.d(id, 6, 0, 6);
        q.d(id, 3, 0, 3);
        q.g(id).d.w = 0.0f;
        int id2 = textView.getId();
        q.d(id2, 3, 0, 3);
        q.d(id2, 6, yia.getId(), 7);
        new l2a(q, 6, id2, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        q.d(id2, 4, textView2.getId(), 3);
        q.d(id2, 7, imageView.getId(), 6);
        q.g(id2).d.w = 0.0f;
        q.g(id2).d.l0 = true;
        int id3 = textView2.getId();
        q.d(id3, 3, textView.getId(), 4);
        q.d(id3, 6, textView.getId(), 6);
        q.d(id3, 7, textView.getId(), 7);
        q.d(id3, 4, 0, 4);
        q.g(id3).d.w = 0.0f;
        q.g(id3).d.W = 2;
        int id4 = imageView.getId();
        q.d(id4, 3, 0, 3);
        q.d(id4, 4, 0, 4);
        q.d(id4, 7, 0, 7);
        q.a(this);
    }

    public final void setAvatars(List<kpa> list) {
        this.G0.setAvatars(list);
    }

    public final void setMessage(jqe jqe) {
        this.I0.setText(jqe != null ? jqe.b(getContext()) : null);
    }

    public final void setName(jqe jqe) {
        this.H0.setText(jqe != null ? jqe.b(getContext()) : null);
    }
}
