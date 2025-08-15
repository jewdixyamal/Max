package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* renamed from: c9a  reason: default package */
public final /* synthetic */ class c9a implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ g9a a;
    public final /* synthetic */ Chip b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ CharSequence e;
    public final /* synthetic */ String f;

    public /* synthetic */ c9a(g9a g9a, Chip chip, long j, long j2, CharSequence charSequence, String str) {
        this.a = g9a;
        this.b = chip;
        this.c = j;
        this.d = j2;
        this.e = charSequence;
        this.f = str;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.b(this.b, z, this.c, this.d, this.e, this.f);
    }
}
