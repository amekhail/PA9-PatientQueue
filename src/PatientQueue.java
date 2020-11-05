public class PatientQueue {
    private Patient[] patients;
    private final int MIN_SIZE = 10;
    private int current_index;
    private int size;

    public PatientQueue() {
        this.patients = new Patient[MIN_SIZE];
        this.current_index = 0;
        this.size = 0;
    }

    public void enqueue(String name, int priority) {
        Patient newPaitient = new Patient(name, priority);
        this.enqueue(newPaitient);
    }

    public void enqueue(Patient patient) {

    }

    public Boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    private void resize() {
        Patient[] newPatients = new Patient[this.patients.length * 2];
        for (int i = 0; i < this.patients.length; i++) {
            newPatients[i] = this.patients[i];
        }
        this.patients = newPatients;
    }
}
