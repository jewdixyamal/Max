package defpackage;

/* renamed from: ez  reason: default package */
public final class ez {
    public final CharSequence a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final boolean f;

    public ez(CharSequence charSequence, String str, String str2, Integer num, Integer num2, boolean z) {
        this.a = charSequence;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = num2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez)) {
            return false;
        }
        ez ezVar = (ez) obj;
        return tpa.f(this.a, ezVar.a) && tpa.f(this.b, ezVar.b) && tpa.f(this.c, ezVar.c) && tpa.f(this.d, ezVar.d) && tpa.f(this.e, ezVar.e) && this.f == ezVar.f;
    }

    public final int hashCode() {
        int i = 0;
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return Boolean.hashCode(this.f) + ((hashCode4 + i) * 31);
    }

    public final String toString() {
        return "AttachDescription(description=" + this.a + ", name=" + this.b + ", image=" + this.c + ", placeholder=" + this.d + ", count=" + this.e + ", isRoundPreview=" + this.f + ")";
    }
}
