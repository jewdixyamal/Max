package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.HashMap;
import one.me.sdk.uikit.common.button.OneMeTitleSubtitleButton;

/* renamed from: il9  reason: default package */
public final class il9 extends v2 implements p03, nse {
    public static final int y0 = yyb.layout_send_location;
    public Group X;
    public TextView Y;
    public ImageButton Z;
    public final boolean o;
    public ChipGroup s0;
    public OneMeTitleSubtitleButton t0;
    public Chip u0;
    public Chip v0;
    public ir7 w0;
    public final jt3 x0 = new jt3((Object) new yt8(10, (Object) this));

    public il9(Context context, boolean z) {
        super(context);
        this.o = z;
    }

    public final void A(ir7 ir7) {
        this.w0 = ir7;
        int s = au1.s(ir7.d);
        if (s == 1) {
            this.X.setVisibility(8);
            this.t0.setTitle(((Context) this.b).getString(this.o ? jpc.M2 : jpc.x2));
        } else if (s == 2) {
            this.X.setVisibility(0);
            this.t0.setTitle((CharSequence) this.x0.get());
            int ordinal = ir7.e.ordinal();
            if (ordinal == 0) {
                ChipGroup chipGroup = this.s0;
                int i = xxb.layout_send_location__duration_20m;
                ana ana = chipGroup.v0;
                n18 n18 = (n18) ((HashMap) ana.c).get(Integer.valueOf(i));
                if (n18 != null && ana.f(n18)) {
                    ana.m();
                }
            } else if (ordinal == 1) {
                ChipGroup chipGroup2 = this.s0;
                int i2 = xxb.layout_send_location__duration_1h;
                ana ana2 = chipGroup2.v0;
                n18 n182 = (n18) ((HashMap) ana2.c).get(Integer.valueOf(i2));
                if (n182 != null && ana2.f(n182)) {
                    ana2.m();
                }
            } else if (ordinal == 2) {
                ChipGroup chipGroup3 = this.s0;
                int i3 = xxb.layout_send_location__duration_3h;
                ana ana3 = chipGroup3.v0;
                n18 n183 = (n18) ((HashMap) ana3.c).get(Integer.valueOf(i3));
                if (n183 != null && ana3.f(n183)) {
                    ana3.m();
                }
            } else if (ordinal == 3) {
                ChipGroup chipGroup4 = this.s0;
                int i4 = xxb.layout_send_location__duration_24h;
                ana ana4 = chipGroup4.v0;
                n18 n184 = (n18) ((HashMap) ana4.c).get(Integer.valueOf(i4));
                if (n184 != null && ana4.f(n184)) {
                    ana4.m();
                }
            } else if (ordinal == 4) {
                ChipGroup chipGroup5 = this.s0;
                int i5 = xxb.layout_send_location__duration_no_limit;
                ana ana5 = chipGroup5.v0;
                n18 n185 = (n18) ((HashMap) ana5.c).get(Integer.valueOf(i5));
                if (n185 != null && ana5.f(n185)) {
                    ana5.m();
                }
            }
            B();
        }
        if (ir7.i) {
            this.v0.setVisibility(8);
            this.u0.setVisibility(0);
            return;
        }
        this.v0.setVisibility(0);
        this.u0.setVisibility(8);
    }

    public final void B() {
        int checkedChipId = this.s0.getCheckedChipId();
        int i = xxb.layout_send_location__duration_20m;
        Context context = (Context) this.b;
        this.t0.setSubtitle(context.getString(jpc.D2, new Object[]{checkedChipId == i ? ay7.m(fzb.tt_dates_minutes, (int) hr7.c.a, context) : checkedChipId == xxb.layout_send_location__duration_1h ? ay7.m(fzb.tt_dates_hours, (int) hr7.o.a, context) : checkedChipId == xxb.layout_send_location__duration_3h ? ay7.m(fzb.tt_dates_hours, (int) hr7.X.a, context) : checkedChipId == xxb.layout_send_location__duration_24h ? ay7.m(fzb.tt_dates_hours, (int) hr7.Y.a, context) : checkedChipId == xxb.layout_send_location__duration_no_limit ? context.getString(jpc.s0) : ""}));
    }

    public final void c() {
        View view = (View) this.c;
        if (view != null) {
            Context context = view.getContext();
            khe khe = sme.a0;
            sme R = fm9.R(context);
            this.Y.setTextColor(R.J);
            ChipGroup chipGroup = this.s0;
            int childCount = chipGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = chipGroup.getChildAt(i);
                if (childAt instanceof Chip) {
                    Chip chip = (Chip) childAt;
                    chip.setTextColor(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{R.m, R.F}));
                    chip.setChipBackgroundColor(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{R.k, R.H}));
                }
            }
            this.Z.setColorFilter(R.J, PorterDuff.Mode.SRC_IN);
            this.Z.setBackground(R.a());
        }
    }

    /* JADX WARNING: type inference failed for: r1v26, types: [java.lang.Object, android.view.View$OnTouchListener] */
    public final void m() {
        this.X = (Group) ((View) this.c).findViewById(xxb.layout_send_location__live_group);
        this.Y = (TextView) ((View) this.c).findViewById(xxb.layout_send_location__tv_pick_duration);
        this.Z = (ImageButton) ((View) this.c).findViewById(xxb.layout_send_location__cancel_button);
        this.s0 = (ChipGroup) ((View) this.c).findViewById(xxb.layout_send_location__cp_duration);
        OneMeTitleSubtitleButton oneMeTitleSubtitleButton = (OneMeTitleSubtitleButton) ((View) this.c).findViewById(xxb.layout_send_location__send_button);
        this.t0 = oneMeTitleSubtitleButton;
        int i = jpc.D2;
        Context context = (Context) this.b;
        String string = context.getString(i);
        int i2 = jpc.M2;
        oneMeTitleSubtitleButton.j(string, context.getString(i2));
        ((Chip) ((View) this.c).findViewById(xxb.layout_send_location__duration_20m)).setText(ay7.m(fzb.tt_dates_minutes, (int) hr7.c.a, context));
        ((Chip) ((View) this.c).findViewById(xxb.layout_send_location__duration_1h)).setText(ay7.m(fzb.tt_dates_hours, (int) hr7.o.a, context));
        ((Chip) ((View) this.c).findViewById(xxb.layout_send_location__duration_3h)).setText(ay7.m(fzb.tt_dates_hours, (int) hr7.X.a, context));
        Chip chip = (Chip) ((View) this.c).findViewById(xxb.layout_send_location__duration_24h);
        this.v0 = chip;
        chip.setText(ay7.m(fzb.tt_dates_hours, (int) hr7.Y.a, context));
        this.u0 = (Chip) ((View) this.c).findViewById(xxb.layout_send_location__duration_no_limit);
        tu0.K(this.t0, 300, new gl9(this, 0));
        tu0.K(this.Z, 300, new gl9(this, 1));
        this.s0.setOnCheckedChangeListener(this);
        c();
        ((View) this.c).setOnTouchListener(new Object());
        if (!this.o) {
            i2 = jpc.x2;
        }
        this.t0.setTitle(context.getString(i2));
    }
}
