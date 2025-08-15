package defpackage;

/* renamed from: su  reason: default package */
public final class su extends pi0 {
    public final /* synthetic */ int b;

    public /* synthetic */ su(int i) {
        this.b = i;
    }

    public String toString() {
        switch (this.b) {
            case 0:
                return "AssetsUpdateEvent{chatId=0}";
            case 1:
                return "AudioRecordLimitEvent{}";
            case 3:
                return "ContactSortEvent";
            case 10:
                return "PhonesSortEvent";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ su(long j, int i) {
        super(j);
        this.b = i;
    }
}
