# SimpleMvp
## 一个精简的Android MVP框架

**Model**：框架中的模型超类，负责提供数据；

**View**：框架中的视图超类，负责UI展示；

**Presenter**：程序中的逻辑超类，负责处理具体事务；

**BaseMvp**：用于创建Model、View和Presenter；

**BasePresenter**：所有Presenter层的抽象类，负责Model、View层的引用和销毁；

**BaseMvpActivity**：Activity基类，具体的实现Model、View的绑定，我们自己的Activity可直接继承于此类或者自行实现BaseActivity继承于此类；

**BaseMvpFragment**：Fragment基类，具体作用和BaseMvpActivity相同。
