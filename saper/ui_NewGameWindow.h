/********************************************************************************
** Form generated from reading UI file 'NewGameWindow.ui'
**
** Created by: Qt User Interface Compiler version 5.2.1
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_NEWGAMEWINDOW_H
#define UI_NEWGAMEWINDOW_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QDialog>
#include <QtWidgets/QDialogButtonBox>
#include <QtWidgets/QFormLayout>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QRadioButton>
#include <QtWidgets/QSpinBox>

QT_BEGIN_NAMESPACE

class Ui_Dialog
{
public:
    QFormLayout *formLayout;
    QLabel *label;
    QRadioButton *idiotButton;
    QRadioButton *beginnerButton;
    QRadioButton *advancedButton;
    QLabel *label_2;
    QLabel *label_3;
    QLabel *label_4;
    QDialogButtonBox *buttonBox;
    QSpinBox *heightBox;
    QSpinBox *widthBox;
    QSpinBox *numOfMinesBox;
    QRadioButton *ownButton;

    void setupUi(QDialog *Dialog)
    {
        if (Dialog->objectName().isEmpty())
            Dialog->setObjectName(QStringLiteral("Dialog"));
        Dialog->resize(305, 239);
        Dialog->setModal(true);
        formLayout = new QFormLayout(Dialog);
        formLayout->setObjectName(QStringLiteral("formLayout"));
        label = new QLabel(Dialog);
        label->setObjectName(QStringLiteral("label"));

        formLayout->setWidget(0, QFormLayout::LabelRole, label);

        idiotButton = new QRadioButton(Dialog);
        idiotButton->setObjectName(QStringLiteral("idiotButton"));

        formLayout->setWidget(0, QFormLayout::FieldRole, idiotButton);

        beginnerButton = new QRadioButton(Dialog);
        beginnerButton->setObjectName(QStringLiteral("beginnerButton"));
        beginnerButton->setChecked(true);

        formLayout->setWidget(1, QFormLayout::FieldRole, beginnerButton);

        advancedButton = new QRadioButton(Dialog);
        advancedButton->setObjectName(QStringLiteral("advancedButton"));

        formLayout->setWidget(2, QFormLayout::FieldRole, advancedButton);

        label_2 = new QLabel(Dialog);
        label_2->setObjectName(QStringLiteral("label_2"));
        label_2->setEnabled(false);

        formLayout->setWidget(4, QFormLayout::LabelRole, label_2);

        label_3 = new QLabel(Dialog);
        label_3->setObjectName(QStringLiteral("label_3"));
        label_3->setEnabled(false);

        formLayout->setWidget(5, QFormLayout::LabelRole, label_3);

        label_4 = new QLabel(Dialog);
        label_4->setObjectName(QStringLiteral("label_4"));
        label_4->setEnabled(false);

        formLayout->setWidget(6, QFormLayout::LabelRole, label_4);

        buttonBox = new QDialogButtonBox(Dialog);
        buttonBox->setObjectName(QStringLiteral("buttonBox"));
        buttonBox->setOrientation(Qt::Horizontal);
        buttonBox->setStandardButtons(QDialogButtonBox::Cancel|QDialogButtonBox::Ok);

        formLayout->setWidget(7, QFormLayout::SpanningRole, buttonBox);

        heightBox = new QSpinBox(Dialog);
        heightBox->setObjectName(QStringLiteral("heightBox"));
        heightBox->setEnabled(false);
        heightBox->setMinimum(1);

        formLayout->setWidget(4, QFormLayout::FieldRole, heightBox);

        widthBox = new QSpinBox(Dialog);
        widthBox->setObjectName(QStringLiteral("widthBox"));
        widthBox->setEnabled(false);
        widthBox->setMinimum(1);

        formLayout->setWidget(5, QFormLayout::FieldRole, widthBox);

        numOfMinesBox = new QSpinBox(Dialog);
        numOfMinesBox->setObjectName(QStringLiteral("numOfMinesBox"));
        numOfMinesBox->setEnabled(false);
        numOfMinesBox->setMinimum(1);

        formLayout->setWidget(6, QFormLayout::FieldRole, numOfMinesBox);

        ownButton = new QRadioButton(Dialog);
        ownButton->setObjectName(QStringLiteral("ownButton"));

        formLayout->setWidget(3, QFormLayout::FieldRole, ownButton);


        retranslateUi(Dialog);
        QObject::connect(buttonBox, SIGNAL(accepted()), Dialog, SLOT(accept()));
        QObject::connect(buttonBox, SIGNAL(rejected()), Dialog, SLOT(reject()));
        QObject::connect(ownButton, SIGNAL(toggled(bool)), heightBox, SLOT(setEnabled(bool)));
        QObject::connect(ownButton, SIGNAL(toggled(bool)), widthBox, SLOT(setEnabled(bool)));
        QObject::connect(ownButton, SIGNAL(toggled(bool)), numOfMinesBox, SLOT(setEnabled(bool)));
        QObject::connect(ownButton, SIGNAL(toggled(bool)), label_2, SLOT(setEnabled(bool)));
        QObject::connect(ownButton, SIGNAL(toggled(bool)), label_3, SLOT(setEnabled(bool)));
        QObject::connect(ownButton, SIGNAL(toggled(bool)), label_4, SLOT(setEnabled(bool)));

        QMetaObject::connectSlotsByName(Dialog);
    } // setupUi

    void retranslateUi(QDialog *Dialog)
    {
        Dialog->setWindowTitle(QApplication::translate("Dialog", "Nowa gra", 0));
        label->setText(QApplication::translate("Dialog", "Tryb", 0));
        idiotButton->setText(QApplication::translate("Dialog", "Kompletny idiota", 0));
        beginnerButton->setText(QApplication::translate("Dialog", "Pocz\304\205tkuj\304\205cy", 0));
        advancedButton->setText(QApplication::translate("Dialog", "Zaawansowany", 0));
        label_2->setText(QApplication::translate("Dialog", "Wysoko\305\233\304\207", 0));
        label_3->setText(QApplication::translate("Dialog", "Szeroko\305\233\304\207", 0));
        label_4->setText(QApplication::translate("Dialog", "Bomby", 0));
        ownButton->setText(QApplication::translate("Dialog", "W\305\202asny", 0));
    } // retranslateUi

};

namespace Ui {
    class Dialog: public Ui_Dialog {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_NEWGAMEWINDOW_H
