package defpackage;

/* renamed from: osa  reason: default package */
public final class osa {
    public final Integer a;
    public final Integer b;
    public final Boolean c;

    public osa(Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, Double d) {
        this.a = num;
        this.b = num2;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osa)) {
            return false;
        }
        osa osa = (osa) obj;
        return tpa.f(this.a, osa.a) && tpa.f(this.b, osa.b) && tpa.f(this.c, osa.c) && tpa.f((Object) null, (Object) null) && tpa.f((Object) null, (Object) null) && tpa.f((Object) null, (Object) null);
    }

    public final int hashCode() {
        int i = 0;
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return (hashCode2 + i) * 29791;
    }

    public final String toString() {
        return "AudioAdaptationParams(minEncoderBitrateKBps=" + this.a + ", minPayloadBitrateKBps=" + this.b + ", useSlowAdaptation=" + this.c + ", minBitrateConstraintBps=null, maxBitrateConstraintBps=null, bitratePriority=null)";
    }
}
