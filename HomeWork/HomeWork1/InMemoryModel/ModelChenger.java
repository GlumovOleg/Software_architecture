package HomeWork.HomeWork1.InMemoryModel;

public interface ModelChenger {
    
    void RigisterModelChenger(ModelChengeObserver o);
    void RemoveModelChenger(ModelChengeObserver o);

    void NotifyChanger(ModelStore o);
}
