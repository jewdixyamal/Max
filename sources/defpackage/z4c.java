package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* renamed from: z4c  reason: default package */
public final /* synthetic */ class z4c implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ b5c a;
    public final /* synthetic */ Chip b;
    public final /* synthetic */ int c;

    public /* synthetic */ z4c(b5c b5c, Chip chip, int i) {
        this.a = b5c;
        this.b = chip;
        this.c = i;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.b(this.b, z, this.c);
    }
}
